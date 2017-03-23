package io.reactivesw.data

import io.reactivesw.data.category.CategoryRunner
import io.reactivesw.data.category.Test1
import io.reactivesw.data.category.Test2
import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Created by Davis on 17/3/23.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses([CategoryRunner.class, Test2.class, Test1.class])
class SpecRunner {
}
