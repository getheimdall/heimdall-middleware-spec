
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

import br.com.conductor.heimdall.middleware.spec.Json;

import java.util.HashMap;
import java.util.Map;

/**
 * Mock class created to help unit test the root request class of a middleware.
 *
 * @author Marcelo Aguiar
 */
public class JsonMockImpl implements Json {

    public String parse(Map<String, Object> body) {

        return "";
    }

    public String parse(String string) {

        return "";
    }

    public <T> String parse(T object) {

        return "";
    }

    @SuppressWarnings("unchecked")
    public <T> T parse(String json, Class<?> classType) {

        return (T) new Object();
    }

    public <T> Map<String, Object> parseToMap(T object) {

        return new HashMap<>();
    }

    public boolean isJson(String string) {

        return true;
    }

}
