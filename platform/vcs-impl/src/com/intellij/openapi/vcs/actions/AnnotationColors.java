/*
 * Copyright 2000-2010 JetBrains s.r.o.
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
package com.intellij.openapi.vcs.actions;

import java.awt.*;

/**
 * @deprecated use {@link AnnotationsSettings} instead
 */
@Deprecated
public interface AnnotationColors {
  int BG_COLORS_PRIME = 3;

  Color[] BG_COLORS = AnnotationsSettings.getInstance().getOrderedColors(null).toArray(new Color[0]);
}
