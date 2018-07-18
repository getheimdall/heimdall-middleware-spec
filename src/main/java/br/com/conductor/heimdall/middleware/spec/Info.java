
package br.com.conductor.heimdall.middleware.spec;

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

/**
 * This interface represents the trace saved by the logger.
 *
 * @author Filipe Germano
 */
public interface Info {

    /**
     * Gets the App name
     *
     * @return app name
     */
    public String appName();

    /**
     * Gets the Api name
     *
     * @return api name
     */
    public String apiName();

    /**
     * Gets the Api id
     *
     * @return api id
     */
    public Long apiId();

    /**
     * Gets the developer name.
     *
     * @return developer name
     */
    public String developer();

    /**
     * Gets the HTTP method
     *
     * @return HTTP method
     */
    public String method();

    /**
     * Gets the client id
     *
     * @return client id
     */
    public String clientId();

    /**
     * Gets the access token
     *
     * @return access token
     */
    public String accessToken();

    /**
     * Gets the pattern
     *
     * @return pattern
     */
    public String pattern();

    /**
     * Gets the operation id
     *
     * @return operation id
     */
    public Long operationId();

    /**
     * Gets the profile
     *
     * @return profile
     */
    public String profile();

    /**
     * Gets the resource id
     *
     * @return resource id
     */
    public Long resourceId();

    /**
     * Gets the url
     *
     * @return url
     */
    public String url();

    /**
     * Gets the request URI
     *
     * @return request URI
     */
    public String requestURI();

}
