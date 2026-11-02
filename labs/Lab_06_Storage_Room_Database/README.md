# Lab 6: Local Persistence with Room Database & SharedPreferences

## Objective
Store and retrieve persistent data locally using Android Jetpack `Room` database (SQLite abstraction) and `SharedPreferences` for user settings.

## Key Exercises
1. **SharedPreferences**: Save user theme preferences, username, and login tokens.
2. **Room Database**:
   - `@Entity`: Define data tables (e.g. `UserEntity`, `TaskEntity`).
   - `@Dao`: Define queries, inserts, updates, and deletes (`@Query`, `@Insert`, `@Delete`).
   - `@Database`: Abstract database instance with singleton pattern.
3. **Reactive UI with Flow / LiveData**: Observe database updates automatically in the UI.
