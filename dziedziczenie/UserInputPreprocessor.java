package dziedziczenie;

public abstract class UserInputPreprocessor {
    private UserInputReader reader;

    public UserInputPreprocessor(UserInputReader reader) {
        this.reader = reader;
    }

    public void process() {
        String input = this.reader.readUserInput();

        String removed = this.removeBadWords(input);
        this.saveResult(removed);
    }

    public abstract String removeBadWords(String input);
    public abstract void saveResult(String processedInput);
}