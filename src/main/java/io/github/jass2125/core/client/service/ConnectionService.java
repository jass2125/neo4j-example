/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.core.client.service;

import org.neo4j.driver.v1.Driver;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since Mar 15, 2018 4:25:05 PM
 */
public interface ConnectionService {

    public Driver openConnection();

    public void closeConnection(Driver driver);
}
