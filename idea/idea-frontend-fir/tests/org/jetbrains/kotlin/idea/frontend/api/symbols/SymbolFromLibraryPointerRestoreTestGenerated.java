/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SymbolFromLibraryPointerRestoreTestGenerated extends AbstractSymbolFromLibraryPointerRestoreTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInResoreSymbolFromLibrary() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary"), Pattern.compile("^(.+)\\.txt$"), null, true);
    }

    @TestMetadata("class.txt")
    public void testClass() throws Exception {
        runTest("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary/class.txt");
    }

    @TestMetadata("classFromJdk.txt")
    public void testClassFromJdk() throws Exception {
        runTest("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary/classFromJdk.txt");
    }

    @TestMetadata("enumEntry.txt")
    public void testEnumEntry() throws Exception {
        runTest("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary/enumEntry.txt");
    }

    @TestMetadata("memberFunction.txt")
    public void testMemberFunction() throws Exception {
        runTest("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary/memberFunction.txt");
    }

    @TestMetadata("memberFunctionWithOverloads.txt")
    public void testMemberFunctionWithOverloads() throws Exception {
        runTest("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary/memberFunctionWithOverloads.txt");
    }

    @TestMetadata("nestedClass.txt")
    public void testNestedClass() throws Exception {
        runTest("idea/idea-frontend-fir/testData/resoreSymbolFromLibrary/nestedClass.txt");
    }
}