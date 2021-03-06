/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.core.client.service;

import io.github.jass2125.core.entity.Post;
import io.github.jass2125.core.entity.User;
import java.util.List;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since Mar 14, 2018 4:58:42 PM
 */
public interface UserService {

    public User login(User user);

    public List<User> loadFollowers(User user);

    public List<Post> loadFeed(User user);

    public List<User> loadNotFollowers(User user);

    public void register(User newUser);
}
