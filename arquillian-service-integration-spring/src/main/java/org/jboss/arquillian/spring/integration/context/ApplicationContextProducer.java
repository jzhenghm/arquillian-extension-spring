/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.arquillian.spring.integration.context;

import org.jboss.arquillian.test.spi.TestClass;

/**
 * <p>Concrete class that implements this interface will be responsible for creating instance of the application
 * context.</p>
 *
 * @param <T> the type of application context
 *
 * @author <a href="mailto:jmnarloch@gmail.com">Jakub Narloch</a>
 * @version $Revision: $
 */
public interface ApplicationContextProducer<T extends TestScopeApplicationContext> {

    /**
     * <p>Returns whether the given producer supports the given test class and can be used for creating the application
     * context.</p>
     *
     * @param testClass the test class
     *
     * @return true if the producer can create the application context, false otherwise
     */
    boolean supports(TestClass testClass);

    /**
     * <p>Creates instance of {@link TestScopeApplicationContext} for the given test class.</p>
     *
     * @param testClass the test class
     *
     * @return the created instance of {@link TestScopeApplicationContext}
     */
    T createApplicationContext(TestClass testClass);
}
