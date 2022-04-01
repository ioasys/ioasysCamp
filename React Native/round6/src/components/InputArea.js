import React from "react";

import { TextInput, StyleSheet, Text } from 'react-native';
import { colors } from '../styles/colors';

const InputArea = ({ titulo, corBorda, placeholder }) => {
    return (
        <><Text style={styles.textTitle}>{titulo}</Text>
        <TextInput
            style={[styles.input, { borderColor: corBorda }]}
            placeholder={placeholder} />
        </>
    );
}

const styles = StyleSheet.create({
    input: {
        width: '100%',
        height: 51,
        borderRadius: 10,
        borderWidth: 1,

    },
    textTitle:{
        fontSize: 12,
        fontStyle:'normal',
        fontWeight:'400',
        color:colors.neutralDarker,
        marginBottom: 8,

    }
})

export default InputArea;