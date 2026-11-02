# Lab 4: Intents, Navigation & Activity Lifecycle

## Objective
Master explicit intents for passing data between activities, implicit intents for opening URLs or phone dialers, and handle the Android Activity Lifecycle (`onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`).

## Key Exercises
1. **Explicit Intent**: Launch a `SecondActivity` sending user profile data via `Intent.putExtra()` and retrieve it via `getIntent().getStringExtra()`.
2. **Implicit Intent**: Launch browser, camera, or email client.
3. **Lifecycle Logging**: Implement lifecycle callbacks and observe state transitions using `Logcat`.
