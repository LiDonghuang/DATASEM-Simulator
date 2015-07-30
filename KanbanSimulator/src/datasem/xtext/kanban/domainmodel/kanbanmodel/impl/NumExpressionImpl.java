/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl#getNumValue <em>Num Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl#isDistribution <em>Distribution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl#getNumDist <em>Num Dist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumExpressionImpl extends MinimalEObjectImpl.Container implements NumExpression
{
  /**
   * The default value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumValue()
   * @generated
   * @ordered
   */
  protected static final String NUM_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumValue()
   * @generated
   * @ordered
   */
  protected String numValue = NUM_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isDistribution() <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistribution()
   * @generated
   * @ordered
   */
  protected static final boolean DISTRIBUTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistribution() <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistribution()
   * @generated
   * @ordered
   */
  protected boolean distribution = DISTRIBUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumDist() <em>Num Dist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumDist()
   * @generated
   * @ordered
   */
  protected Distribution numDist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KanbanmodelPackage.Literals.NUM_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumValue()
  {
    return numValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumValue(String newNumValue)
  {
    String oldNumValue = numValue;
    numValue = newNumValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.NUM_EXPRESSION__NUM_VALUE, oldNumValue, numValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistribution()
  {
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistribution(boolean newDistribution)
  {
    boolean oldDistribution = distribution;
    distribution = newDistribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.NUM_EXPRESSION__DISTRIBUTION, oldDistribution, distribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution getNumDist()
  {
    return numDist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumDist(Distribution newNumDist, NotificationChain msgs)
  {
    Distribution oldNumDist = numDist;
    numDist = newNumDist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST, oldNumDist, newNumDist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumDist(Distribution newNumDist)
  {
    if (newNumDist != numDist)
    {
      NotificationChain msgs = null;
      if (numDist != null)
        msgs = ((InternalEObject)numDist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST, null, msgs);
      if (newNumDist != null)
        msgs = ((InternalEObject)newNumDist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST, null, msgs);
      msgs = basicSetNumDist(newNumDist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST, newNumDist, newNumDist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST:
        return basicSetNumDist(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_VALUE:
        return getNumValue();
      case KanbanmodelPackage.NUM_EXPRESSION__DISTRIBUTION:
        return isDistribution();
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST:
        return getNumDist();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_VALUE:
        setNumValue((String)newValue);
        return;
      case KanbanmodelPackage.NUM_EXPRESSION__DISTRIBUTION:
        setDistribution((Boolean)newValue);
        return;
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST:
        setNumDist((Distribution)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_VALUE:
        setNumValue(NUM_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.NUM_EXPRESSION__DISTRIBUTION:
        setDistribution(DISTRIBUTION_EDEFAULT);
        return;
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST:
        setNumDist((Distribution)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_VALUE:
        return NUM_VALUE_EDEFAULT == null ? numValue != null : !NUM_VALUE_EDEFAULT.equals(numValue);
      case KanbanmodelPackage.NUM_EXPRESSION__DISTRIBUTION:
        return distribution != DISTRIBUTION_EDEFAULT;
      case KanbanmodelPackage.NUM_EXPRESSION__NUM_DIST:
        return numDist != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (numValue: ");
    result.append(numValue);
    result.append(", distribution: ");
    result.append(distribution);
    result.append(')');
    return result.toString();
  }

} //NumExpressionImpl
