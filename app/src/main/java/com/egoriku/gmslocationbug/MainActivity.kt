package com.egoriku.gmslocationbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.egoriku.gmslocationbug.ui.theme.GMSLocationBugTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GMSLocationBugTheme {
                Surface {
                    Box(modifier = Modifier.fillMaxSize()) {
                        PermissionButton(
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(32.dp),
                            onLocationEnabled = { toast("Location enabled") },
                            onLocationDisabled = { toast("Location disabled") }
                        )
                    }
                }
            }
        }
    }
}