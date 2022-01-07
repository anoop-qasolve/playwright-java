/*
 * Copyright (c) Microsoft Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.playwright.assertions;

import java.util.*;

/**
 * The {@code APIResponseAssertions} class provides assertion methods that can be used to make assertions about the {@code APIResponse}
 * in the tests. A new instance of {@code APIResponseAssertions} is created by calling {@link PlaywrightAssertions#assertThat
 * PlaywrightAssertions.assertThat()}:
 * <pre>{@code
 * ...
 * import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
 *
 * public class TestPage {
 *   ...
 *   @Test
 *   void navigatesToLoginPage() {
 *     ...
 *     APIResponse response = page.request().get('https://playwright.dev');
 *     assertThat(response).isOK();
 *   }
 * }
 * }</pre>
 */
public interface APIResponseAssertions {
  /**
   * Makes the assertion check for the opposite condition. For example, this code tests that the response status is not
   * successfull:
   * <pre>{@code
   * assertThat(response).not().isOK();
   * }</pre>
   */
  APIResponseAssertions not();
  /**
   * Ensures the response status code is within [200..299) range.
   * <pre>{@code
   * assertThat(response).isOK();
   * }</pre>
   */
  void isOK();
}

