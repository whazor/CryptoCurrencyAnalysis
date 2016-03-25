/**
 * This class is generated by jOOQ
 */
package jooq.database.tables.records;


import javax.annotation.Generated;

import jooq.database.tables.Txn;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TxnRecord extends UpdatableRecordImpl<TxnRecord> implements Record3<String, Integer, Integer> {

	private static final long serialVersionUID = 825003436;

	/**
	 * Setter for <code>public.Txn.hash</code>.
	 */
	public void setHash(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.Txn.hash</code>.
	 */
	public String getHash() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.Txn.block_id</code>.
	 */
	public void setBlockId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.Txn.block_id</code>.
	 */
	public Integer getBlockId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.Txn.id</code>.
	 */
	public void setId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.Txn.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Txn.TXN.HASH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Txn.TXN.BLOCK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Txn.TXN.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getHash();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getBlockId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TxnRecord value1(String value) {
		setHash(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TxnRecord value2(Integer value) {
		setBlockId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TxnRecord value3(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TxnRecord values(String value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TxnRecord
	 */
	public TxnRecord() {
		super(Txn.TXN);
	}

	/**
	 * Create a detached, initialised TxnRecord
	 */
	public TxnRecord(String hash, Integer blockId, Integer id) {
		super(Txn.TXN);

		setValue(0, hash);
		setValue(1, blockId);
		setValue(2, id);
	}
}
