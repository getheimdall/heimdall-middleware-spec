
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

import br.com.conductor.heimdall.middleware.spec.DBMongo;
import br.com.conductor.heimdall.middleware.util.Page;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.mongodb.morphia.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock class created to help unit test the root request class of a middleware.
 *
 * @author Marcelo Aguiar
 */
public class DBMockImpl implements DBMongo {

    DBMockImpl(String databaseName) {
    }

    @Override
    public <T> T save(T object) {

        return object;
    }

    @Override
    public <T> T update(T object) {

        return save(object);
    }

    @Override
    public <T> Boolean delete(T object) {

        return true;
    }

    @Override
    public <T> T findOne(T object) {

        return object;
    }

    @Override
    public <T> List<T> findAll(Class<T> classType) {

        return new ArrayList<>();
    }

    @Override
    public <T> Page<T> find(Object criteria, Integer page, Integer limit) {

        return new Page<>();
    }

    @Override
    public <T> Page<T> buildPage(List<T> list, Integer page, Integer limit, Long totalElements) {

        return new Page<>();
    }

    @Override
    public <T> void insertMany(MongoCollection<Document> collection, List<T> objects) {

    }

    @Override
    public <T> void insertOne(MongoCollection<Document> collection, T object) {

    }

    @Override
    public <T> Query<T> getQueryProvider(Object criteria) {

        return (Query<T>) new Object();
    }

    @Override
    public <T> Page<T> find(MongoCollection<Document> collection, Class<T> classType, Bson filters, Integer page, Integer limit) {

        return new Page<>();
    }

    @Override
    public MongoCollection<Document> collection(String name) {

        return null;
    }

    @Override
    public <T> MongoCollection<Document> collection(Class<T> classType) {

        return null;
    }

    @Override
    public <T> T merge(T object) {

        return findOne(object);
    }

}
