/**
 * This document is a part of the source code and related artifacts for
 * SMSystem.
 * www.apeironsol.com
 * Copyright © 2012 apeironsol
 * 
 */
package com.apeironsol.need.core.service;

import java.util.Collection;

import com.apeironsol.need.financial.model.StudentFee;

/**
 * Service layer interface for Student Attendance DAO implementation.
 * 
 * @author Pradeep
 * 
 */
public interface StudentFeeService {

	StudentFee saveStudentFee(final StudentFee studentFee);

	void removeStudentFee(final StudentFee studentFee);

	/**
	 * Find student fees by student id and academic year id.
	 * 
	 * @param studentId
	 *            student id.
	 * @param acadmicYearId
	 *            academic year id.
	 * @return collection of student fees by student id and academic year id.
	 */
	Collection<StudentFee> findStudentFeesByStudentIdAndAcadmicYearId(final Long studentId, final Long acadmicYearId);

	/**
	 * Find student fees by student academic year id.
	 * 
	 * @param studentAcadmicYearId
	 *            studentAcadmicYearId.
	 * @return collection of student fees by student academic year id.
	 */
	Collection<StudentFee> findStudentFeesByStudentAcadmicYearId(final Long studentAcadmicYearId);

	/**
	 * Find student fees by student academic year id.
	 * 
	 * @param studentAcadmicYearId
	 *            studentAcadmicYearId.
	 * @return collection of student fees by student academic year id.
	 */
	StudentFee findStudentFeeByStudentAcadmicYearIdAndKlassFeeId(final Long studentAcadmicYearId, final Long klassFeeId);

	/**
	 * Find student fees by student academic year id.
	 * 
	 * @param studentAcadmicYearId
	 *            studentAcadmicYearId.
	 * @return collection of student fees by student academic year id.
	 */
	StudentFee findStudentFeeByStudentAcadmicYearIdAndBranchFeeId(final Long studentAcadmicYearId, final Long branchFeeId);

	/**
	 * Find student fees by student academic year id.
	 * 
	 * @param studentAcadmicYearId
	 *            studentAcadmicYearId.
	 * @return collection of student fees by student academic year id.
	 */
	StudentFee findStudentFeeByStudentAcadmicYearIdAndStudentFeeId(final Long studentAcadmicYearId, final Long studentFeeId);

	/**
	 * 
	 * @param studentAcadmicYearId
	 * @param pickupPointFeeId
	 * @return
	 */
	StudentFee findStudentFeeByStudentAcadmicYearIdAndPickupPointFeeId(Long studentAcadmicYearId, Long pickupPointFeeId);

	/**
	 * 
	 * @param acadmicYearId
	 * @param pickupPointFeeId
	 * @return
	 */
	Collection<StudentFee> findStudentFeeByAcadmicYearIdAndPickupPointFeeId(Long acadmicYearId, Long pickupPointFeeId);

}
