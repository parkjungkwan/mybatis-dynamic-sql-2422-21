/*
 *    Copyright 2016-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.dynamic.sql.util.kotlin

import org.mybatis.dynamic.sql.insert.BatchInsertDSL
import org.mybatis.dynamic.sql.insert.GeneralInsertDSL
import org.mybatis.dynamic.sql.insert.InsertDSL
import org.mybatis.dynamic.sql.insert.MultiRowInsertDSL

typealias GeneralInsertCompleter = @MyBatisDslMarker GeneralInsertDSL.() -> Unit

typealias InsertCompleter<T> = @MyBatisDslMarker InsertDSL<T>.() -> Unit

typealias MultiRowInsertCompleter<T> = @MyBatisDslMarker MultiRowInsertDSL<T>.() -> Unit

typealias BatchInsertCompleter<T> = @MyBatisDslMarker BatchInsertDSL<T>.() -> Unit

typealias InsertSelectCompleter = @MyBatisDslMarker KotlinInsertSelectSubQueryBuilder.() -> Unit
