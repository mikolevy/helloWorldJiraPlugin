package ut.com.atlassian.tutorial.helloWorldJiraPlugin;

import org.junit.Test;
import com.atlassian.tutorial.helloWorldJiraPlugin.api.MyPluginComponent;
import com.atlassian.tutorial.helloWorldJiraPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}