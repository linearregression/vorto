/**
 * Copyright (c) 2015-2016 Bosch Software Innovations GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Bosch Software Innovations GmbH - Please refer to git log
 */
package org.eclipse.vorto.repository.service;

import org.eclipse.vorto.repository.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alexander Edelmann - Robert Bosch (SEA) Pte. Ltd.
 */
public interface IUserRepository extends CrudRepository<User, Long> {
    /**
     * finds the user by the specified email address
     * @param email
     * @return
     */
	User findByEmail(String email);
	
	/**
	 * Finds the user by the specified username
	 * @param username
	 * @return
	 */
    User findByUsername(String username);
}