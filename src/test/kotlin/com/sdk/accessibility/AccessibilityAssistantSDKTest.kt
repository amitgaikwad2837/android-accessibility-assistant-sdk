package com.sdk.accessibility

import org.junit.Test
import kotlin.test.assertEquals

class AccessibilityAssistantSDKTest {
    @Test
    fun testAccessibilityConfig() {
        val config = AccessibilityConfig(
            enableVoiceNavigation = true,
            voiceSpeed = 1.5f,
            language = "en-US"
        )
        
        assertEquals(true, config.enableVoiceNavigation)
        assertEquals(1.5f, config.voiceSpeed)
    }

    @Test
    fun testAccessibleElement() {
        val element = AccessibleElement(
            id = "elem-123",
            type = "Button",
            text = "Submit",
            isClickable = true
        )
        
        assertEquals("Submit", element.text)
        assertEquals(true, element.isClickable)
    }

    @Test
    fun testAccessibilityScore() {
        val score = AccessibilityScore(
            wcagLevel = "AAA",
            readabilityScore = 0.95f
        )
        
        assertEquals("AAA", score.wcagLevel)
        assertEquals(0.95f, score.readabilityScore)
    }

    @Test
    fun testAccessibilityConfigDefaults() {
        val config = AccessibilityConfig()
        assertEquals(true, config.enableVoiceNavigation)
        assertEquals(true, config.enableOverlay)
        assertEquals(1.0f, config.voiceSpeed)
        assertEquals("en-US", config.language)
    }

    @Test
    fun testAccessibleElementTypes() {
        val buttonElement = AccessibleElement(
            id = "btn-1",
            type = "Button",
            text = "Submit",
            isClickable = true
        )
        
        val textElement = AccessibleElement(
            id = "txt-1",
            type = "TextView",
            text = "Label",
            isClickable = false
        )
        
        assertEquals("Button", buttonElement.type)
        assertEquals("TextView", textElement.type)
    }

    @Test
    fun testAccessibilityScoreRange() {
        val score = AccessibilityScore(
            wcagLevel = "AA",
            readabilityScore = 0.75f,
            navigationScore = 0.85f
        )
        
        assertTrue(score.readabilityScore in 0f..1f)
        assertTrue(score.navigationScore in 0f..1f)
    }

    @Test
    fun testAccessibilityEventTypes() {
        assertEquals(4, AccessibilityEventType.values().size)
        assertTrue(AccessibilityEventType.values().contains(AccessibilityEventType.SCREEN_ANALYZED))
        assertTrue(AccessibilityEventType.values().contains(AccessibilityEventType.GUIDANCE_STARTED))
    }

    @Test
    fun testScreenAnalysisWithElements() {
        val elements = listOf(
            AccessibleElement("1", "Button", "OK", isClickable = true),
            AccessibleElement("2", "Button", "Cancel", isClickable = true),
            AccessibleElement("3", "Label", "Confirm action?", isClickable = false)
        )
        
        val analysis = ScreenAnalysis(
            id = "screen-1",
            elements = elements,
            accessibility = AccessibilityScore("AA")
        )
        
        assertEquals(3, analysis.elements.size)
        assertEquals(2, analysis.elements.filter { it.isClickable }.size)
    }
}
