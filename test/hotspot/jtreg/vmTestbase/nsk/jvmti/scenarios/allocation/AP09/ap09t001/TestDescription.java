/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/scenarios/allocation/AP09/ap09t001.
 * VM Testbase keywords: [quick, jpda, jvmti, noras]
 * VM Testbase readme:
 * DESCRIPTION
 *   The test implements AP09 scenario of test plan for Allocation
 *   Profiling.
 *   The test checks if correct jvmtiObjectReferenceKind constants,
 *   are passed in jvmtiObjectReferenceCallback while iteration
 *   with IterateOverObjectsReachableFromObject function call.
 *   The test class 'ap09t001' defines and initializes
 *   static and instance fields, sets tags for them.
 *   The test class also sets tags for class objects,
 *   class loader, protection domain and implemented interface.
 *   The test agent calls IterateOverObjectsReachableFromObject
 *   function. The test fails if any of expected
 *   jvmtiObjectReferenceKind constant has not been passed
 *   in to the callback.
 * COMMENTS
 *   The test case for JVMTI_REFERENCE_SIGNERS and
 *   JVMTI_REFERENCE_CONSTANT_POOL are excluded due to
 *   test implementation issues.
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @build ExecDriver
 *        nsk.jvmti.scenarios.allocation.AP09.ap09t001
 * @run main/othervm/native PropertyResolvingWrapper ExecDriver --java
 *      "-agentlib:ap09t001=-waittime=5 -verbose"
 *      nsk.jvmti.scenarios.allocation.AP09.ap09t001
 */

