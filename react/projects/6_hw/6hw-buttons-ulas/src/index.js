import React from 'react'
import styles from './styles.module.css'

export const Button = (props) => {
  const controlType = (type) => {
    switch (type) {
      case 'primary':
        return styles.btnPrimary
      case 'default':
        return styles.btnDefault
      case 'dashed':
        return styles.btnDashed
      case 'text':
        return styles.btnText
      default:
        return styles.btnLink
    }
  }
  return (
    <button className={`${styles.btn} ${controlType(props.type)}`} {...props}>
      {props.text}
    </button>
  )
}
