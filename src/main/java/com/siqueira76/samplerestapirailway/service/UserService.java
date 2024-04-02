package com.siqueira76.samplerestapirailway.service;

import com.siqueira76.samplerestapirailway.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
