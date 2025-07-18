/*
 * Copyright (C) 2014 Square, Inc.
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
package okhttp3.curl

import com.github.ajalt.clikt.core.main
import kotlin.test.BeforeTest
import kotlin.test.Test
import okhttp3.TestUtil.assumeNotWindows

class OkcurlTest {
  @BeforeTest
  fun skipWindows() {
    // Failing with
    // org.gradle.internal.remote.internal.MessageIOException: Could not write '/127.0.0.1:16225'.
    assumeNotWindows()
  }

  @Test
  fun simple() {
    Main().main(listOf("--help"))
  }
}
