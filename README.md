# 📱 Android Lab Class (`Android_lab_class`)

Welcome to the **Android Lab Class** repository! This project contains all laboratory exercises, classroom demos, and practical coursework for Android mobile application development.

---

## 🎯 Lab 1: My First Android App (`lab_demo`)

This lab implements the exact classroom demonstration and assignment requirement:

<div align="center">
  <img src="../../phone_screen.png" width="300" alt="App Preview" />
</div>

### 📋 Overview & Requirements
- **Title**: `My First Android App`
- **Input Field**: Outlined text field with hint `"Enter your name"` (`@id/name_edit1`)
- **Submit Button**: Blue primary action button (`@id/savebt`)
- **Clear Button**: Secondary action button (`@id/clearbt`)
- **Greeting TextView**: Dynamic text display (`@id/fname`)
- **Toast Notifications**: Interactive feedback on action execution

### 🧪 Test Cases (Verification Steps)
1. **Enter Name Test**:
   - Type `Worku` in the input field.
   - Click **Submit**.
   - Result: Greeting displays `Hello, Worku!` and a long Toast appears.
2. **Empty Validation Test**:
   - Leave the input field empty.
   - Click **Submit**.
   - Result: An error message `"Please enter your name"` is shown on the field and as a Toast.
3. **Clear Button Test**:
   - Click **Clear**.
   - Result: The input field is emptied, the greeting text disappears, and focus returns to the input.

---

## 🏗️ Project Structure

```
Android_lab_class/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/android_lab_class/
│   │   │   ├── MainActivity.java        # Classroom implementation (Java + findViewById)
│   │   │   └── MainActivityKotlin.kt    # Modern Kotlin alternative
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── lab_demo.xml         # XML layout with card design & IDs
│   │   │   ├── values/
│   │   │   │   ├── strings.xml          # Translatable strings
│   │   │   │   └── themes.xml           # App styling
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── labs/
│   ├── Lab_01_My_First_App/
│   ├── Lab_02_Layouts_and_UI_Controls/
│   ├── Lab_03_Event_Handling_and_Toast/
│   ├── Lab_04_Intents_and_Navigation/
│   ├── Lab_05_RecyclerView_and_Adapters/
│   └── Lab_06_Storage_Room_Database/
├── build.gradle.kts
└── settings.gradle.kts
```

---

## 🚀 How to Run in Android Studio

1. Open **Android Studio**.
2. Select **File > Open...** and navigate to:
   ```
   D:\Desktop\Mobile App\Android_lab_class
   ```
3. Wait for Gradle sync to complete.
4. Select your emulator or connected physical device.
5. Click **Run (`Shift + F10`)**.

---

## 💻 Code Reference

### `lab_demo.xml` Component IDs:
| View Type | ID | Description |
|-----------|----|-------------|
| `TextInputEditText` | `@+id/name_edit1` | User name input field |
| `MaterialButton` | `@+id/savebt` | Submit button |
| `MaterialButton` | `@+id/clearbt` | Clear button |
| `TextView` | `@+id/fname` | Output greeting label |
| `MaterialCardView` | `@+id/card_container` | Styled card container |

### Classroom Java Code (`MainActivity.java`):
```java
setContentView(R.layout.lab_demo);
ftxt = (TextView) findViewById(R.id.fname);
name_edit1 = (EditText) findViewById(R.id.name_edit1);
bt1 = (Button) findViewById(R.id.savebt);
clearbt = (Button) findViewById(R.id.clearbt);

bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name = name_edit1.getText().toString().trim();
        if (name.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter your name", Toast.LENGTH_SHORT).show();
            ftxt.setText("Please enter your name");
        } else {
            String greeting = "Hello, " + name + "!";
            Toast.makeText(getApplicationContext(), greeting, Toast.LENGTH_LONG).show();
            ftxt.setText(greeting);
        }
    }
});
```
