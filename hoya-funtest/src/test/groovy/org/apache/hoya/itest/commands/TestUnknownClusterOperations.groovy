/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hoya.itest.commands

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.apache.bigtop.itest.shell.Shell
import org.apache.hoya.funtest.itest.HoyaCommandTestBase
import org.junit.Test

/**
 * Test the return code from ops against unknown clusters are what we expect
 */
@CompileStatic
@Slf4j
public class TestUnknownClusterOperations extends HoyaCommandTestBase {


  public static final String UNKNOWN = "unknown_cluster"


  @Test
  public void testFreezeUnknownCluster() throws Throwable {
    Shell shell = freeze(UNKNOWN)
    assertUnknownCluster(shell)
  }

  @Test
  public void testFreezeForceUnknownCluster() throws Throwable {
    Shell shell = freezeForce(UNKNOWN)
    assertUnknownCluster(shell)
  }

  @Test
  public void testDestroyUnknownCluster() throws Throwable {
    Shell shell = destroy(UNKNOWN)
    assertSuccess(shell)
  }

  @Test
  public void testListUnknownCluster() throws Throwable {
    assertUnknownCluster(list(UNKNOWN))
  }

  @Test
  public void testExistsUnknownCluster() throws Throwable {
    assertUnknownCluster(exists(UNKNOWN))
  }

  @Test
  public void testThawUnknownCluster() throws Throwable {
    assertUnknownCluster(thaw(UNKNOWN))
  }

  @Test
  public void testStatusUnknownCluster() throws Throwable {
    assertUnknownCluster(status(UNKNOWN))
  }


  @Test
  public void testGetConfUnknownCluster() throws Throwable {
    assertUnknownCluster(getConf(UNKNOWN))
  }


}
