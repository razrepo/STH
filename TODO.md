# Stick Hero Game — TODO

## Description
The repository contains a JavaFX game structure, Maven metadata, and Java source for the engine, controller, and panels. The POM targets Java 21/JavaFX 21 and includes JUnit dependencies, but no test source tree was found. Images.java loads files from a root-relative images/ directory absent from the inspected tree. The POM names HelloApplication as launch class, while StickHero is the visible application entry point. The project was not built or run.

## Quick wins
- [ ] Expand README with game overview, Java/Maven/JavaFX requirements, class map, and launch guidance after verifying it.
- [ ] Document expected controls and screens after confirming them in a run-through.
- [ ] Clarify the launch class mismatch between the POM and StickHero.
- [ ] Document or recover the expected images/ assets and their sources/licensing.

## Larger follow-up
- [ ] Decide whether hello-view.fxml and its HelloController reference are starter-template leftovers or intended parts of the app.
- [ ] Add engine tests for distance generation, stick outcomes, score, and replay if maintaining the project.
- [ ] Review controller updates and threading against JavaFX UI-thread expectations; this is a review item, not a verified runtime failure.
- [ ] Verify build and launch instructions on Java 21 with JavaFX dependencies.
