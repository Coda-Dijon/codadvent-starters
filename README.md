# Codadvent - starters

Squelettes prêts à l'emploi pour les exercices du calendrier de l'Avent [codadvent](https://codadvent.fr/).

![Codadvent cover](img/cover.webp)

Chaque projet contient un `HelloWorld` dans le code de production (namespace `codadvent`) et **1 test automatisé** qui le vérifie : copiez le dossier de votre langage et remplacez le `HelloWorld` par votre exercice du jour.

| Langage | Dossier | Outils de test | Lancer les tests |
|---|---|---|---|
| C | [`c/`](c) | `assert.h` (Make ou CMake) | `make test` |
| COBOL | [`cobol/`](cobol/README.md) | GnuCOBOL 3 (`cobc`) + programme de test (Make) | `make test` |
| C# | [`csharp/`](csharp) | xUnit (.NET 10) | `dotnet test` |
| Java | [`java/`](java) | JUnit 5 + AssertJ (Java 25) | `mvn test` |
| PHP | [`php/`](php) | Pest | `composer install && composer test` |
| TypeScript | [`typescript/`](typescript) | Vite + Vitest | `npm install && npm test` |
| Python | [`python/`](python) | pytest | `python3 -m venv .venv && .venv/bin/pip install -e ".[test]" && .venv/bin/pytest` |
| Scala | [`scala/`](scala) | ScalaTest (Scala 3, sbt) | `sbt test` |
| Kotlin | [`kotlin/`](kotlin) | JUnit 5 + AssertJ (Maven) | `mvn test` |
| Rust | [`rust/`](rust) | `cargo test` (test d'intégration dans `tests/`) | `cargo test` |

## Le namespace `codadvent` selon le langage
- **C** : pas de namespace, les fonctions sont préfixées : `codadvent_hello_world()`.
- **COBOL** : pas de namespace, le sous-programme est préfixé : `CALL "CODADVENT-HELLO-WORLD" USING WS-RESULT`. Installation sous Windows, macOS et Linux : voir [`cobol/README.md`](cobol/README.md).
- **C#** : `namespace Codadvent;` (PascalCase, convention .NET).
- **Java** : `package codadvent;`.
- **PHP** : `namespace Codadvent;` (PascalCase, convention PSR-4).
- **TypeScript** : `export namespace codadvent { ... }` dans `src/helloWorld.ts`.
- **Python** : package `codadvent` (`from codadvent.hello_world import say_hello`).
- **Scala / Kotlin** : `package codadvent`.
- **Rust** : la crate s'appelle `codadvent` (`use codadvent::hello_world::say_hello;`).

Les fichiers générés (builds, dépendances, venv...) sont ignorés par le [`.gitignore`](.gitignore) du dossier.
