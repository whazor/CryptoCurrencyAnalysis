/**
 * This class is generated by jOOQ
 */
package jooq.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.database.tables.Blockheader;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class BlockheaderRecord extends UpdatableRecordImpl<BlockheaderRecord> implements Record7<Integer, Short, String, String, Timestamp, Long, Long> {

	private static final long serialVersionUID = 932524312;

	/**
	 * Setter for <code>public.BlockHeader.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.BlockHeader.nVersion</code>.
	 */
	public void setNversion(Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.nVersion</code>.
	 */
	public Short getNversion() {
		return (Short) getValue(1);
	}

	/**
	 * Setter for <code>public.BlockHeader.hashPrevBlock</code>.
	 */
	public void setHashprevblock(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.hashPrevBlock</code>.
	 */
	public String getHashprevblock() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.BlockHeader.hashMerkleRoot</code>.
	 */
	public void setHashmerkleroot(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.hashMerkleRoot</code>.
	 */
	public String getHashmerkleroot() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.BlockHeader.nTime</code>.
	 */
	public void setNtime(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.nTime</code>.
	 */
	public Timestamp getNtime() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>public.BlockHeader.nBits</code>.
	 */
	public void setNbits(Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.nBits</code>.
	 */
	public Long getNbits() {
		return (Long) getValue(5);
	}

	/**
	 * Setter for <code>public.BlockHeader.nonce</code>.
	 */
	public void setNonce(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.BlockHeader.nonce</code>.
	 */
	public Long getNonce() {
		return (Long) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Short, String, String, Timestamp, Long, Long> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, Short, String, String, Timestamp, Long, Long> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Blockheader.BLOCKHEADER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return Blockheader.BLOCKHEADER.NVERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Blockheader.BLOCKHEADER.HASHPREVBLOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Blockheader.BLOCKHEADER.HASHMERKLEROOT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Blockheader.BLOCKHEADER.NTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field6() {
		return Blockheader.BLOCKHEADER.NBITS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return Blockheader.BLOCKHEADER.NONCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getNversion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getHashprevblock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getHashmerkleroot();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getNtime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value6() {
		return getNbits();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value7() {
		return getNonce();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value2(Short value) {
		setNversion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value3(String value) {
		setHashprevblock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value4(String value) {
		setHashmerkleroot(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value5(Timestamp value) {
		setNtime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value6(Long value) {
		setNbits(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord value7(Long value) {
		setNonce(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockheaderRecord values(Integer value1, Short value2, String value3, String value4, Timestamp value5, Long value6, Long value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BlockheaderRecord
	 */
	public BlockheaderRecord() {
		super(Blockheader.BLOCKHEADER);
	}

	/**
	 * Create a detached, initialised BlockheaderRecord
	 */
	public BlockheaderRecord(Integer id, Short nversion, String hashprevblock, String hashmerkleroot, Timestamp ntime, Long nbits, Long nonce) {
		super(Blockheader.BLOCKHEADER);

		setValue(0, id);
		setValue(1, nversion);
		setValue(2, hashprevblock);
		setValue(3, hashmerkleroot);
		setValue(4, ntime);
		setValue(5, nbits);
		setValue(6, nonce);
	}
}
