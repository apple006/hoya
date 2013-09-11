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

package org.apache.hadoop.hoya.providers.accumulo;

import org.apache.hadoop.hoya.HoyaKeys;

/**
 * Any keys related to acculumulo
 */
public interface AccumuloKeys {
  String PROVIDER_ACCUMULO = "accumulo";
  
  String ROLE_MASTER = HoyaKeys.ROLE_MASTER;

  String ROLE_TABLET = "tablet";
  String ROLE_GARBAGE_COLLECTOR = "gc";
  String ROLE_MONITOR = "monitor";
  String ROLE_TRACER = "tracer";

  String DEFAULT_MASTER_HEAP = "256";
  String DEFAULT_MASTER_YARN_RAM = "384";
  String DEFAULT_MASTER_YARN_VCORES = "1";
  String DEFAULT_ROLE_YARN_VCORES = "1";
  String DEFAULT_ROLE_HEAP = DEFAULT_MASTER_HEAP;
  String DEFAULT_ROLE_YARN_RAM = DEFAULT_MASTER_YARN_RAM;

// org.apache.hadoop.hoya.providers.accumulo.conf

  String VERSION = "version";

  String CREATE_MASTER = ROLE_MASTER;
  String CREATE_GC = ROLE_GARBAGE_COLLECTOR;
  String CREATE_TABLET = ROLE_TABLET;
  String CREATE_MONITOR = ROLE_MONITOR;
  String CREATE_TRACER  = ROLE_TRACER;


  String ACTION_START = "start";
  String ACTION_STOP = "stop";

  /**
   * Config directory : {@value}
   */
  String ARG_CONFIG = "--config";
  /**
   *  name of the hbase script relative to the hbase root dir:  {@value}
   */
  String START_SCRIPT = "bin/accumulo";
  /**
   *  name of the hbase subdir in the archive:  {@value}
   */
  String ARCHIVE_SUBDIR = "accumulo-1.6.0-SNAPSHOT";
  /**
   *  name of the site conf to generate :  {@value}
   */
  String SITE_XML = "accumulo-site.xml";

  /**
   * Template stored in the hoya classpath -to use if there is
   * no site-specific template
   *  {@value}
   */
  String CONF_RESOURCE = "/org/apache/hadoop/hoya/providers/accumulo/conf";
  String SITE_XML_RESOURCE = CONF_RESOURCE + SITE_XML;
}