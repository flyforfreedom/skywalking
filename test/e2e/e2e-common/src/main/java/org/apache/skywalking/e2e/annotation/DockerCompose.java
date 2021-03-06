/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.e2e.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.apache.skywalking.e2e.SkyWalkingExtension;
import org.testcontainers.containers.DockerComposeContainer;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Fields of type {@link DockerComposeContainer} annotated with {@link DockerCompose @DockerCompose} can be initialized
 * by {@link SkyWalkingExtension} with the given {@link #value() docker-compose.yml} files, for more details and
 * exampless, refer to the JavaDoc of {@link SkyWalkingExtension}.
 */
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface DockerCompose {
    /**
     * @return the {@code docker-compose.yml} files
     */
    String[] value();
}
