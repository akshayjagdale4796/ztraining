package Keywoed.tests;

import keyword.engine.KeyWordEngine;
import org.testng.annotations.Test;

public class LogInTest
{
    public KeyWordEngine keywordengine;
    @Test
    public void loginTest()
    {
        keywordengine =new KeyWordEngine();
        keywordengine.startExecution("login");
    }
}
