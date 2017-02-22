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
package org.apache.beam.sdk.io.hdfs;

import org.apache.hadoop.security.UserGroupInformation;

import javax.annotation.Nullable;
import java.io.IOException;

/**
 * {@link UserGroupInformation} helper methods.
 */
public class UGIHelper {

  /**
   * Find the most appropriate UserGroupInformation to use.
   * @param username the user name, or NULL if none is specified.
   * @return the most appropriate UserGroupInformation
   */
  public static UserGroupInformation getBestUGI(@Nullable String username) throws IOException {
    return UserGroupInformation.getBestUGI(null, username);
  }

}
