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

package org.apache.hoya.yarn.params;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import org.apache.hoya.yarn.HoyaActions;


@Parameters(commandNames = {HoyaActions.ACTION_AM_SUICIDE},
            commandDescription = HoyaActions.DESCRIBE_ACTION_AM_SUICIDE)
public class ActionAMSuicideArgs extends AbstractActionArgs {

  @Parameter(names = {ARG_MESSAGE},
             description = "reason for the action")
  public String message;
  
  @Parameter(names = {ARG_EXITCODE},
             description = "exit code")
  public int exitcode = 1;

  @Parameter(names = {ARG_WAIT},
             description = "time for AM to wait before exiting")
  public int waittime = 1000;
}
