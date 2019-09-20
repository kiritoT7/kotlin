/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
package com.intellij.find.editorHeaderActions;

import com.intellij.find.EditorSearchSession;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.IdeActions;
import org.jetbrains.annotations.NotNull;

public class AddOccurrenceAction extends OccurrenceAction {
  public AddOccurrenceAction() {
    super(IdeActions.ACTION_SELECT_NEXT_OCCURENCE, AllIcons.Actions.AddMulticaret);
  }

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    e.getRequiredData(EditorSearchSession.SESSION_KEY).addNextOccurrence();
  }
}
