package seedu.zerotoone.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.zerotoone.testutil.Assert.assertThrows;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import seedu.zerotoone.commons.exceptions.IllegalValueException;
import seedu.zerotoone.commons.util.JsonUtil;
import seedu.zerotoone.model.ExerciseList;
import seedu.zerotoone.testutil.TypicalExercises;

public class JsonSerializableExerciseListTest {

    private static final Path TEST_DATA_FOLDER = Paths.get("src", "test", "data", "JsonSerializableExerciseListTest");
    private static final Path TYPICAL_EXERCISES_FILE = TEST_DATA_FOLDER.resolve("typicalExercisesExerciseList.json");
    private static final Path INVALID_EXERCISE_FILE = TEST_DATA_FOLDER.resolve("invalidExerciseExerciseList.json");
    private static final Path DUPLICATE_EXERCISE_FILE = TEST_DATA_FOLDER.resolve("duplicateExerciseExerciseList..json");

    @Test
    public void toModelType_typicalExercisesFile_success() throws Exception {
        JsonSerializableExerciseList dataFromFile = JsonUtil.readJsonFile(TYPICAL_EXERCISES_FILE,
                JsonSerializableExerciseList.class).get();
        ExerciseList exerciseListFromFile = dataFromFile.toModelType();
        ExerciseList typicalExercisesExerciseList = TypicalExercises.getTypicalExerciseList();
        assertEquals(exerciseListFromFile, typicalExercisesExerciseList);
    }

    @Test
    public void toModelType_invalidExerciseFile_throwsIllegalValueException() throws Exception {
        JsonSerializableExerciseList dataFromFile = JsonUtil.readJsonFile(INVALID_EXERCISE_FILE,
                JsonSerializableExerciseList.class).get();
        assertThrows(IllegalValueException.class, dataFromFile::toModelType);
    }

    @Test
    public void toModelType_duplicateExercises_throwsIllegalValueException() throws Exception {
        JsonSerializableExerciseList dataFromFile = JsonUtil.readJsonFile(DUPLICATE_EXERCISE_FILE,
                JsonSerializableExerciseList.class).get();
        assertThrows(IllegalValueException.class, JsonSerializableExerciseList.MESSAGE_DUPLICATE_EXERCISE,
                dataFromFile::toModelType);
    }

}