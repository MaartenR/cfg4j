/*
 * Copyright 2015 Norbert Potocki (norbert.potocki@nort.pl)
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
package org.cfg4j.source.git;

import org.cfg4j.source.context.Environment;

import java.nio.file.Path;

/**
 * Specifies path to use in git repository.
 */
public interface PathResolver {

  /**
   * Extract git branch name to use for a given {@code environment}. For extraction mechanism details
   * refer to the implementing class javadoc.
   *
   * @param environment environment to extract git path from
   * @return path
   */
  Path getPathFor(Environment environment);

}
