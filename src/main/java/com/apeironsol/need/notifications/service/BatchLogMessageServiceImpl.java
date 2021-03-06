/**
 * This document is a part of the source code and related artifacts for
 * SMSystem.
 * www.apeironsol.com
 * Copyright © 2012 apeironsol
 */
package com.apeironsol.need.notifications.service;

import java.util.Collection;
import java.util.EnumSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.apeironsol.framework.exception.BusinessException;
import com.apeironsol.framework.exception.InvalidArgumentException;
import com.apeironsol.need.notifications.dao.BatchLogMessageDao;
import com.apeironsol.need.notifications.model.BatchLogMessage;
import com.apeironsol.need.util.constants.BatchLogMessageStatusConstant;

/**
 * Service class for batch log message.
 * 
 * @author Pradeep
 */
@Service("batchLogMessageService")
@Transactional(rollbackFor = Exception.class)
public class BatchLogMessageServiceImpl implements BatchLogMessageService {

	@Autowired
	private BatchLogMessageDao	batchLogMessageDao;

	@Override
	public BatchLogMessage findBatchLogMessageById(final Long id) throws BusinessException {
		return this.batchLogMessageDao.findById(id);
	}

	@Override
	public BatchLogMessage saveBatchLogMessage(final BatchLogMessage batchLogMessage) throws BusinessException, InvalidArgumentException {
		return this.batchLogMessageDao.persist(batchLogMessage);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public BatchLogMessage saveBatchLogMessageInNewTransaction(final BatchLogMessage batchLogMessage) throws BusinessException, InvalidArgumentException {
		return this.batchLogMessageDao.persist(batchLogMessage);
	}

	@Override
	public void removeBatchLogMessage(final BatchLogMessage batchLogMessage) throws BusinessException {
		this.batchLogMessageDao.remove(batchLogMessage);
	}

	@Override
	public Collection<BatchLogMessage> findAllBatchLogMessages() throws BusinessException {
		return this.batchLogMessageDao.findAll();
	}

	@Override
	public Collection<BatchLogMessage> findBatchLogMessagesByBatchLogId(final Long batchLogId) throws BusinessException {
		return this.batchLogMessageDao.findBatchLogMessagesByBatchLogId(batchLogId);
	}

	@Override
	public Long findNumberOfBatchLogMessagesByBatchLogIdAndStatus(final Long batchLogId, final EnumSet<BatchLogMessageStatusConstant> statusConstants)
			throws BusinessException {
		return this.batchLogMessageDao.findNumberOfBatchLogMessagesByBatchLogIdAndStatus(batchLogId, statusConstants);
	}

	@Override
	public Collection<BatchLogMessage> findBatchLogMessagesByBatchLogIdAndSectionId(final Long batchLogId, final Long sectionId) throws BusinessException {
		return this.batchLogMessageDao.findBatchLogMessagesByBatchLogIdAndSectionId(batchLogId, sectionId);
	}

	@Override
	public Collection<BatchLogMessage> findBatchLogMessagesByStudentAcademicYearId(final Long studentAcademicYearId) throws BusinessException {
		return this.batchLogMessageDao.findBatchLogMessagesByStudentAcademicYearId(studentAcademicYearId);
	}

	@Override
	public BatchLogMessage findBatchLogMessageByBatchLogIdAndStudentAcademicYearId(final Long batchLogId, final Long studentAcademicYearId)
			throws BusinessException {
		return this.batchLogMessageDao.findBatchLogMessageByBatchLogIdAndStudentAcademicYearId(batchLogId, studentAcademicYearId);
	}

	@Override
	public Collection<BatchLogMessage> findBatchLogMessagesByBatchLogIds(final Collection<Long> batchLogIds) throws BusinessException {
		return this.batchLogMessageDao.findBatchLogMessagesByBatchLogIds(batchLogIds);
	}

	@Override
	public Collection<BatchLogMessage> findBatchLogMessagesByStudentId(final Long studentId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BatchLogMessage findBatchLogMessageByBatchLogIdAndStudentId(final Long batchLogId, final Long studentId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
