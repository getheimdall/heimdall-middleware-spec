
package br.com.conductor.heimdall.middleware.util.helpermock.call;

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

import br.com.conductor.heimdall.middleware.spec.Info;

/**
 * Mock class created to help unit test the root request class of a middleware.
 *
 * @author Marcelo Aguiar
 */
public class InfoMock implements Info {

    @Override
    public String appName() {
        return "";
    }

    @Override
    public String apiName() {
        return "";
    }

    @Override
    public Long apiId() {
        return 0L;
    }

    @Override
    public String developer() {
        return "";
    }

    @Override
    public String method() {
        return "";
    }

    @Override
    public String clientId() {
        return "";
    }

    @Override
    public String accessToken() {
        return "";
    }

    @Override
    public String pattern() {
        return "";
    }

    @Override
    public Long operationId() {
        return 0L;
    }

    @Override
    public String profile() {
        return "";
    }

    @Override
    public Long resourceId() {
        return 0L;
    }

    @Override
    public String url() {
        return "";
    }

    @Override
    public String requestURI() {
        return "";
    }

}
