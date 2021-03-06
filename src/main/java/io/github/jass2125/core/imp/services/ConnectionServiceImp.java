/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.core.imp.services;

import javax.ejb.Stateless;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import io.github.jass2125.core.client.service.ConnectionService;
import io.github.jass2125.core.exceptions.CredentialsNeo4jInvalidException;
import org.neo4j.driver.v1.AuthToken;
import org.neo4j.driver.v1.exceptions.AuthenticationException;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since Mar 15, 2018 4:20:33 PM
 */
@Stateless
public class ConnectionServiceImp implements ConnectionService {

    private final String uri = "bolt://localhost:7687";
    private final AuthToken authTokens = AuthTokens.basic("neo4j", "123");

    @Override
    public Driver openConnection() {
        try {
            return GraphDatabase.driver(uri, authTokens);
        } catch (AuthenticationException e) {
            throw new CredentialsNeo4jInvalidException("Credentials invalid", e);
        }
    }

    @Override
    public void closeConnection(Driver driver) {
        driver.close();
    }

}
