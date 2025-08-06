
# ExitDialog
### LATEST-VERSION
[![](https://jitpack.io/v/alphatech-apps/ExitDialog.svg)](https://jitpack.io/#alphatech-apps/ExitDialog)


## Install
Add it in your root `build.gradle` at the end of repositories:
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency:
```gradle
dependencies {
	    implementation 'com.github.alphatech-apps:ExitDialog:LATESTVERSION'
	}
```

## Features
* Day Night
* Material/Custom Design

## Usage

[//]: # ()
[//]: # (Add view to your layout:)

[//]: # (```xml)

[//]: # ()
[//]: # ( ```)

Setup JAVA:
 ```java
                new Exit_Dialog_Custom(MainActivity.this).show();
 ```
 ```java
                new Exit_Dialog_Material(MainActivity.this).showDialog(false);
  ```
```java
                new Exit_Dialog_Material(MainActivity.this).showDialog(true);
 ```

[//]: # ()
[//]: # (or add other >>>>)

[//]: # ()
[//]: # ( ```java)

[//]: # ()
[//]: # ( ```)

[//]: # ()
[//]: # (Listeners:)

[//]: # ()
[//]: # ( ```java)

[//]: # ()
[//]: # ( ```)

[//]: # ()
[//]: # ()
[//]: # (Other Methods on Menu Preference:)

[//]: # ()
[//]: # (```java)

[//]: # ()
[//]: # (```)

[//]: # (.)

[//]: # (.)

[//]: # (.)

[//]: # (.)

[//]: # (.)

[//]: # (.)

[//]: # ()
## full activity for example
.....................

[//]: # (activity_main:)

[//]: # (```xml)

[//]: # ()
[//]: # ( ```)

MainActivity:
```java

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                new Exit_Dialog_Custom(MainActivity.this).show();
                new Exit_Dialog_Material(MainActivity.this).showDialog(false);
                new Exit_Dialog_Material(MainActivity.this).showDialog(true);
            }
        });
    }
}
```

## Screenshots
![](https://github.com/alphatech-apps/ExitDialog/blob/master/Screenshots/1.png)
![](https://github.com/alphatech-apps/ExitDialog/blob/master/Screenshots/2.png)
![](https://github.com/alphatech-apps/ExitDialog/blob/master/Screenshots/3.png)
