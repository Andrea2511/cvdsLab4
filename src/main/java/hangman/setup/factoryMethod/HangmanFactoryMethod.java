package hangman.setup.factoryMethod;

import hangman.model.Language;
import hangman.model.GameScore;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;

abstract public class HangmanFactoryMethod {
    abstract public GameScore createScore();
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
}
