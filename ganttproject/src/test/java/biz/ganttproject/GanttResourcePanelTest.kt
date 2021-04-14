package biz.ganttproject

import net.sourceforge.ganttproject.GanttProject
import net.sourceforge.ganttproject.GanttResourcePanel
import net.sourceforge.ganttproject.resource.HumanResource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GanttResourcePanelTest {

  private lateinit var grp : GanttResourcePanel

  @BeforeEach
  fun setUp() {
    val g = GanttProject(true)
    grp= GanttResourcePanel(g,g.uiFacade)
  }

  @Test
  fun `initialization`() {
    assert(grp.nbPeople() == 0)
  }




}
