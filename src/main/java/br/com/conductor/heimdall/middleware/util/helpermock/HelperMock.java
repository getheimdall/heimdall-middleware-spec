
package br.com.conductor.heimdall.middleware.util.helpermock;

/*-
 * =========================LICENSE_START==================================
 * heimdall-middleware-spec
 * ========================================================================
 * Copyright (C) 2018 Conductor Tecnologia SA
 * ========================================================================
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
 * ==========================LICENSE_END===================================
 */

import br.com.conductor.heimdall.middleware.spec.*;

/**
 * Mock class created to help unit test the root request class of a middleware.
 *
 * @author Marcelo Aguiar
 */
public class HelperMock implements Helper {

    public ApiResponse apiResponse() {
        return new ApiResponseMockImpl();
    }

    public Call call() {
        return new CallMockImpl();
    }

    public DB db(String databaseName) {
        return new DBMockImpl(databaseName);
    }

    public DBMongo dbMongo(String databaseName) {
        return (DBMongo) db(databaseName);
    }

    public Http http() {
        return new HttpMockImpl();
    }

    public Json json() {
        return new JsonMockImpl();
    }

    public Xml xml() {
        return new XmlMockImpl();
    }
}
