package android.car.usb.handler

import android.app.Activity
import android.os.Bundle

/** Fixed-handler entry point. The system grants USB permission before launching this activity. */
class UsbHostManagementActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The fixed GM handler has granted this package USB access. The Play
        // app binds to the bridge when it starts; no foreground service is
        // needed while the Play app owns the connection.
        finish()
    }
}
