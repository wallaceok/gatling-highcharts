/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.component

import com.excilys.ebi.gatling.charts.series.Series
import com.excilys.ebi.gatling.highcharts.series.ResponseTimeSeries
import com.excilys.ebi.gatling.highcharts.template.GroupDetailsDurationTemplate

object GroupDetailsDurationComponent {

	def apply(runStart: Long, durations: Series[Int, (Int, Int)]) = {
		val template = new GroupDetailsDurationTemplate(
			new ResponseTimeSeries(durations.name, runStart, durations.data, durations.colors.head))

		new HighchartsComponent(template)
	}
}