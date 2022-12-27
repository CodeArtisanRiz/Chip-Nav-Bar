# Chip-Nav-Bar


settings.gradle
dependencyResolutionManagement {
repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    ...
    maven { url 'https://jitpack.io' }
    }
}

build.gradle
    defaultConfig {
    ...
    minSdk 23
    ...
    }

dependencies {
    ...
    implementation 'com.github.ismaeldivita:chip-navigation-bar:1.4.0'
}

colors.xml
    ...
    <color name="home">#2495BF</color>
    <color name="activity">#2495BF</color>
    <color name="favorites">#2495BF</color>
    <color name="settings">#2495BF</color>
    ...

create menu dir in res
create bottom_menu.xml
code: 
 ...
    <item
        android:id="@+id/home"
        android:icon="@drawable/ic_home"
        android:title="Home"
        app:cnb_iconColor="@color/home"/>
    <item
        android:id="@+id/activity"
        android:icon="@drawable/ic_activity"
        android:title="Activity"
        app:cnb_iconColor="@color/activity"/>
    <item
        android:id="@+id/favorites"
        android:icon="@drawable/ic_heart"
        android:title="Favorites"
        app:cnb_iconColor="@color/favorites" />
    <item
        android:id="@+id/settings"
        android:icon="@drawable/ic_settings"
        android:title="Settings"
        app:cnb_iconColor="@color/settings" />
...

activity_main.xml
    ...
    <com.ismaeldivita.chipnavigation.ChipNavigationBar
    android:id="@+id/bottom_menu"
    android:layout_width="match_parent"
    android:layout_height="70dp"
    android:layout_gravity="bottom"
    android:background="@color/white"
    android:elevation="16dp"
    android:padding="8dp"
    app:cnb_menuResource="@menu/bottom_menu"
    app:layout_constraintBottom_toBottomOf="parent" />
    ...

MainActivity.kt

...
private val menu by lazy { findViewById<ChipNavigationBar>(R.id.bottom_menu) }
    ...
        menu.setOnItemSelectedListener { id ->
            when (id) {
                R.id.home -> {
                Toast.makeText(applicationContext, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.activity -> {
                Toast.makeText(applicationContext, "Activity", Toast.LENGTH_SHORT).show()
                }
                R.id.favorites -> {
                Toast.makeText(applicationContext, "Fav", Toast.LENGTH_SHORT).show()
                }
                R.id.settings -> {
                Toast.makeText(applicationContext, "Settings", Toast.LENGTH_SHORT).show()
                }
                else -> {}
            }
        }
    ...
