
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
import com.google.common.collect.Lists;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.mockito.Mockito;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import java.util.List;

/**
 * Mock class created to help unit test the root request class of a middleware.
 *
 * @author Marcelo Aguiar
 */
public class DBMockImpl implements DBMongo {

    private List<Object> mongoDatabase;

    private String databaseName;

    DBMockImpl(String databaseName) {
        this.mongoDatabase = Lists.newArrayList();
        this.databaseName = databaseName;
    }

    @Override
    public <T> T save(T object) {

        try {
            mongoDatabase.add(object);
            return object;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public <T> T update(T object) {

        return save(object);
    }

    @Override
    public <T> Boolean delete(T object) {

        this.mongoDatabase.remove(object);
        return true;
    }

    @Override
    public <T> T findOne(T object) {

        return (T) mongoDatabase.get(mongoDatabase.indexOf(object));
    }

    @Override
    public <T> List<T> findAll(Class<T> classType) {

        return Lists.newArrayList();
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

        return (Query<T>) this.datastore().createQuery(criteria.getClass());
    }

    @Override
    public <T> Page<T> find(MongoCollection<Document> collection, Class<T> classType, Bson filters, Integer page, Integer limit) {

        return new Page<>();
    }

    @Override
    public MongoCollection<Document> collection(String name) {

        return database().getCollection(name);
    }

    @Override
    public <T> MongoCollection<Document> collection(Class<T> classType) {

        return database().getCollection(classType.getSimpleName());
    }

    @Override
    public <T> T merge(T object) {

        try {
            return findOne(object);
        } catch (Exception e) {
            return null;
        }

    }

    /*
     * Private helper methods
     */
    private MongoClient createMongoClient() {
        return Mockito.mock(MongoClient.class);
    }

    private Datastore datastore() {

        return new Morphia().createDatastore(createMongoClient(), this.databaseName);
    }

    private MongoDatabase database() {

        return createMongoClient().getDatabase(databaseName);
    }

}
