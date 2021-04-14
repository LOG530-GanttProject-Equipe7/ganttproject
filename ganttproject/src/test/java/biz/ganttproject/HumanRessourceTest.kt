package biz.ganttproject

import biz.ganttproject.core.time.impl.GregorianTimeUnitStack
import net.sourceforge.ganttproject.resource.HumanResource
import net.sourceforge.ganttproject.resource.HumanResourceManager
import net.sourceforge.ganttproject.task.CustomColumnsManager
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*
import biz.ganttproject.core.calendar.GanttDaysOff


class HumanRessourceTest {

  private lateinit var hr : HumanResource

  @BeforeEach
  fun setUp() {
    val hrManager = HumanResourceManager(null, CustomColumnsManager())
    hr = HumanResource("test",2,hrManager)
  }

  @Test
  fun `initialization`() {
    val name = "test"
    val id = 2
    assert(name == hr.name)
    assert(id == hr.id)
  }

  @Test
  fun `dayOff`() {
    val d = Date();
    val dOff = GanttDaysOff(d, GregorianTimeUnitStack.DAY.adjustRight(d))
    hr.addDaysOff(dOff)
    assert(hr.daysOff.size() == 1)
  }

  @Test
  fun `clone`() {
    val hrclone = hr.unpluggedClone()
    assert(hrclone.name == hr.name)
    assert(hrclone.id == hr.id)
  }




}