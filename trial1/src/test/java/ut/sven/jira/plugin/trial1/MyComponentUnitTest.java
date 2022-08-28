package ut.sven.jira.plugin.trial1;

import org.junit.Test;
import sven.jira.plugin.trial1.api.MyPluginComponent;
import sven.jira.plugin.trial1.impl.MyPluginComponentImpl;

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