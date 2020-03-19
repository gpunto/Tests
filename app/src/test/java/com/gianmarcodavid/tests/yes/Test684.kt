package com.gianmarcodavid.tests.yes

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.gianmarcodavid.tests.R
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Test684 {
    private val provider = ApplicationProvider.getApplicationContext<Context>().resources

    @Test
    fun abc() {
        println(provider.getString(R.string.app_name))
    }

    @Test
    fun def() {
        println(provider.getString(R.string.app_name))
    }

    @Test
    fun ghi() {
        println(provider.getString(R.string.app_name))
    }
}
