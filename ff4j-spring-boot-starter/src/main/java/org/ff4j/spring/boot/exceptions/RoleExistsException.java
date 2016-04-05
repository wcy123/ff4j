package org.ff4j.spring.boot.exceptions;

/*
 * #%L
 * ff4j-spring-boot-starter
 * %%
 * Copyright (C) 2013 - 2016 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author <a href="mailto:paul58914080@gmail.com">Paul Williams</a>
 */
@ResponseStatus(value = HttpStatus.NOT_MODIFIED, reason = "role already exists")
public class RoleExistsException extends RuntimeException {
    private static final long serialVersionUID = 7763322883611169970L;
}
