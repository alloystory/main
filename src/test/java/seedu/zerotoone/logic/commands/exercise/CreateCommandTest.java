package seedu.zerotoone.logic.commands.exercise;

import static java.util.Objects.requireNonNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.zerotoone.testutil.Assert.assertThrows;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import javafx.collections.ObservableList;
import seedu.zerotoone.commons.core.GuiSettings;
import seedu.zerotoone.logic.commands.CommandResult;
import seedu.zerotoone.logic.commands.exceptions.CommandException;
import seedu.zerotoone.model.Model;
import seedu.zerotoone.model.exercise.Exercise;
import seedu.zerotoone.model.exercise.ExerciseList;
import seedu.zerotoone.model.exercise.ReadOnlyExerciseList;
import seedu.zerotoone.model.userprefs.ReadOnlyUserPrefs;
import seedu.zerotoone.testutil.ExerciseBuilder;

public class CreateCommandTest {

    // @Test
    // public void constructor_nullExercise_throwsNullPointerException() {
    //     assertThrows(NullPointerException.class, () -> new CreateCommand(null));
    // }

    // @Test
    // public void execute_exerciseAcceptedByModel_addSuccessful() throws Exception {
    //     ModelStubAcceptingExerciseAdded modelStub = new ModelStubAcceptingExerciseAdded();
    //     Exercise validExercise = new ExerciseBuilder().build();

    //     CommandResult commandResult = new CreateCommand(validExercise).execute(modelStub);

    //     assertEquals(String.format(CreateCommand.MESSAGE_SUCCESS, validExercise), commandResult.getFeedbackToUser());
    //     assertEquals(Arrays.asList(validExercise), modelStub.exercisesAdded);
    // }

    // @Test
    // public void execute_duplicateExercise_throwsCommandException() {
    //     Exercise validExercise = new ExerciseBuilder().build();
    //     CreateCommand createCommand = new CreateCommand(validExercise);
    //     ModelStub modelStub = new ModelStubWithExercise(validExercise);

    //     assertThrows(
    //             CommandException.class, CreateCommand.MESSAGE_DUPLICATE_EXERCISE, () -> createCommand.execute(modelStub));
    // }

    // @Test
    // public void equals() {
    //     Exercise alice = new ExerciseBuilder().withName("Alice").build();
    //     Exercise bob = new ExerciseBuilder().withName("Bob").build();
    //     CreateCommand addAliceCommand = new CreateCommand(alice);
    //     CreateCommand addBobCommand = new CreateCommand(bob);

    //     // same object -> returns true
    //     assertTrue(addAliceCommand.equals(addAliceCommand));

    //     // same values -> returns true
    //     CreateCommand addAliceCommandCopy = new CreateCommand(alice);
    //     assertTrue(addAliceCommand.equals(addAliceCommandCopy));

    //     // different types -> returns false
    //     assertFalse(addAliceCommand.equals(1));

    //     // null -> returns false
    //     assertFalse(addAliceCommand.equals(null));

    //     // different exercise -> returns false
    //     assertFalse(addAliceCommand.equals(addBobCommand));
    // }

    // /**
    //  * A default model stub that have all of the methods failing.
    //  */
    // private class ModelStub implements Model {
    //     @Override
    //     public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public ReadOnlyUserPrefs getUserPrefs() {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public GuiSettings getGuiSettings() {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void setGuiSettings(GuiSettings guiSettings) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public Path getExerciseListFilePath() {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void setExerciseListFilePath(Path exerciseListFilePath) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void addExercise(Exercise exercise) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void setExerciseList(ReadOnlyExerciseList newData) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public ReadOnlyExerciseList getExerciseList() {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public boolean hasExercise(Exercise exercise) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void deleteExercise(Exercise target) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void setExercise(Exercise target, Exercise editedExercise) {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public ObservableList<Exercise> getFilteredExerciseList() {
    //         throw new AssertionError("This method should not be called.");
    //     }

    //     @Override
    //     public void updateFilteredExerciseList(Predicate<Exercise> predicate) {
    //         throw new AssertionError("This method should not be called.");
    //     }
    // }

    // /**
    //  * A Model stub that contains a single exercise.
    //  */
    // private class ModelStubWithExercise extends ModelStub {
    //     private final Exercise exercise;

    //     ModelStubWithExercise(Exercise exercise) {
    //         requireNonNull(exercise);
    //         this.exercise = exercise;
    //     }

    //     @Override
    //     public boolean hasExercise(Exercise exercise) {
    //         requireNonNull(exercise);
    //         return this.exercise.isSameExercise(exercise);
    //     }
    // }

    // /**
    //  * A Model stub that always accept the exercise being added.
    //  */
    // private class ModelStubAcceptingExerciseAdded extends ModelStub {
    //     final ArrayList<Exercise> exercisesAdded = new ArrayList<>();

    //     @Override
    //     public boolean hasExercise(Exercise exercise) {
    //         requireNonNull(exercise);
    //         return exercisesAdded.stream().anyMatch(exercise::isSameExercise);
    //     }

    //     @Override
    //     public void addExercise(Exercise exercise) {
    //         requireNonNull(exercise);
    //         exercisesAdded.add(exercise);
    //     }

    //     @Override
    //     public ReadOnlyExerciseList getExerciseList() {
    //         return new ExerciseList();
    //     }
    // }

}