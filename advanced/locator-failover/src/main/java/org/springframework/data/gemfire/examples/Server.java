/*
 * Copyright 2012 the original author or authors.
 *
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
 */
package org.springframework.data.gemfire.examples;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {
	public static void main(String args[]) throws IOException {

		System.out
				.println("Start locators on 10334 and 10335 and Press <Enter> to continue");
		System.in.read();

		new ClassPathXmlApplicationContext("server/cache-config.xml");

		System.out.println("Press <Enter> to terminate the server");
		System.in.read();
		System.exit(0);
	}

}
